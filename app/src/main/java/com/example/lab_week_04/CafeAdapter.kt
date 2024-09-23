package com.example.lab_week_04

val TABS_FIXED = listOf(
R.string.starbucks _ title,
R.string.janjijiwa _ title,
R.string.kopikenangan _ title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }
    override fun createFragment(position: Int): Fragment
    {
        return CafeDetailFragment()
    }
}