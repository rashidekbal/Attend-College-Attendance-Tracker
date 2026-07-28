package com.rtechnologies.attend_collegeattendancetracker.screens.home;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.constants.FragmentIds;
import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityHomeBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.attendance.AttandanceFragment;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.home.HomeFragment;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.marks.MarksFragment;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.sidebar.SideBarFragment;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.task.TaskFragment;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private FragmentManager fragmentManager;
    ActionBarDrawerToggle drawerToggle;
    private String currentFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        init();
        setupNavigationSystem();
        setUpDrawerLayout();
        handleBackPress();
    }

    private void handleBackPress() {
        getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                int count=fragmentManager.getBackStackEntryCount();
                if (count > 1) {
                    fragmentManager.popBackStackImmediate();
                    return;
                }
                finish();
            }
        });
    }


    private void setUpDrawerLayout() {
        getSupportFragmentManager().beginTransaction().add(binding.sideBarLayout.getId(),new SideBarFragment()).commit();
    }

    private void setupNavigationSystem() {
        binding.bottomNavigation.setOnItemSelectedListener(this::handleNavigation);
        ColorStateList colorStateList= ResourcesCompat.getColorStateList(getResources(),R.color.bottom_nav_icon_color_list,null);
        binding.bottomNavigation.setItemIconTintList(colorStateList);
        binding.bottomNavigation.setItemTextColor(colorStateList);
        binding.bottomNavigation.setSelectedItemId(R.id.home);
        handleFragmentBackStackChange();

    }

    private void handleFragmentBackStackChange() {
        fragmentManager.addOnBackStackChangedListener(()->{
            int count=fragmentManager.getBackStackEntryCount();
            if(count<1)return;
            String entryId=fragmentManager.getBackStackEntryAt(count-1).getName();
            if(entryId==null)return;
            if(entryId.equals(FragmentIds.HOME_FRAGMENT.toString())){
                binding.bottomNavigation.setSelectedItemId(R.id.home);
                return;
            }
            if(entryId.equals(FragmentIds.ATTENDANCE_FRAGMENT.toString())){
                binding.bottomNavigation.setSelectedItemId(R.id.attendance);
                return;
            }
            if(entryId.equals(FragmentIds.TASK_FRAGMENT.toString())){
                binding.bottomNavigation.setSelectedItemId(R.id.task);
                return;
            }
            if(entryId.equals(FragmentIds.MARKS_FRAGMENT.toString())){
                binding.bottomNavigation.setSelectedItemId(R.id.marks);
            }


        });
    }

    private boolean handleNavigation(MenuItem menuItem) {
        if(matches(menuItem,R.id.home)){
            if(isCurrentFragment(FragmentIds.HOME_FRAGMENT.toString())){
                return true;
            }
            currentFragment=FragmentIds.HOME_FRAGMENT.toString();
            if(hasFragmentInBackStack(FragmentIds.HOME_FRAGMENT.toString())){
                fragmentManager.popBackStack(currentFragment,0);
                return true;
            }
            changeFragment(new HomeFragment(), FragmentIds.HOME_FRAGMENT.toString());
            return true;
        }
        if(matches(menuItem,R.id.attendance)){
            if(isCurrentFragment(FragmentIds.ATTENDANCE_FRAGMENT.toString())){
                return true;
            }
            currentFragment=FragmentIds.ATTENDANCE_FRAGMENT.toString();
            if(hasFragmentInBackStack(FragmentIds.ATTENDANCE_FRAGMENT.toString())){
                fragmentManager.popBackStack(currentFragment,0);
                return true;
            }
            changeFragment(new AttandanceFragment(),FragmentIds.ATTENDANCE_FRAGMENT.toString());
            return true;
        }
        if(matches(menuItem,R.id.task)){
            if(isCurrentFragment(FragmentIds.TASK_FRAGMENT.toString())){
                return true;
            }
            currentFragment=FragmentIds.TASK_FRAGMENT.toString();
            if(hasFragmentInBackStack(FragmentIds.TASK_FRAGMENT.toString())){
                fragmentManager.popBackStack(currentFragment,0);
                return true;
            }
            changeFragment(new TaskFragment(),FragmentIds.TASK_FRAGMENT.toString());
            return true;
        }
        if(matches(menuItem,R.id.marks)){
            if(isCurrentFragment(FragmentIds.MARKS_FRAGMENT.toString())){
                return true;
            }
            currentFragment=FragmentIds.MARKS_FRAGMENT.toString();
            if(hasFragmentInBackStack(FragmentIds.MARKS_FRAGMENT.toString())){
                fragmentManager.popBackStack(currentFragment,0);
                return true;
            }
            changeFragment(new MarksFragment(),FragmentIds.MARKS_FRAGMENT.toString());
            return true;
        }
        return false;
    }

    private boolean hasFragmentInBackStack(String fragmentId) {
        int entryCount=fragmentManager.getBackStackEntryCount();
        for(int i=0;i<entryCount;i++){
            String fe=fragmentManager.getBackStackEntryAt(i).getName();
            if(fe==null)return false;
            if(fe.equals(fragmentId))return true;
        }
        return false;
    }

    private boolean isCurrentFragment(String fragmentId) {
        return fragmentId.equals(currentFragment);

    }

    private boolean matches(MenuItem menuItem, int home) {
        return menuItem.getItemId()==home;
    }

    private void init(){
        this.fragmentManager=getSupportFragmentManager();
        drawerToggle=new ActionBarDrawerToggle(this,binding.main,R.string.open_drawer,R.string.close_drawer);

    }

    private void changeFragment(Fragment fragment,@Nullable String id){
        fragmentManager.beginTransaction().replace(binding.mainContainer.getId(),fragment).addToBackStack(id).commit();

    }

}