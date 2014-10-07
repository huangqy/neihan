package com.north.neihan;

import java.util.LinkedList;
import java.util.List;

import com.north.neihan.fragment.EssayFragment;
import com.north.neihan.fragment.HuoDongFragment;
import com.north.neihan.fragment.ImageFragment;
import com.north.neihan.fragment.MyFragment;
import com.north.neihan.fragment.ReviewFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity implements
		OnCheckedChangeListener {

	private List<Fragment> fragments;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RadioGroup group = (RadioGroup) this.findViewById(R.id.main_tab_bar);
		group.setOnCheckedChangeListener(this);

		fragments = new LinkedList<Fragment>();
		fragments.add(new EssayFragment());
		fragments.add(new ImageFragment());
		fragments.add(new ReviewFragment());
		fragments.add(new HuoDongFragment());
		fragments.add(new MyFragment());

		switchFragment(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		int childCount = group.getChildCount();
		int checkedIndex = 0;
		RadioButton btn = null;
		for (int i = 0; i < childCount; i++) {
			btn = (RadioButton) group.getChildAt(i);
			if (btn.isChecked()) {
				checkedIndex = i;
				break;
			}
		}

		switchFragment(checkedIndex);
	}

	private void switchFragment(int checkedIndex) {
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.replace(R.id.main_fragment_container, fragments.get(checkedIndex));
		transaction.commit();
	}
}
