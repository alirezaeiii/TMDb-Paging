package com.sample.android.tmdb.ui.base

import com.sample.android.tmdb.SortType
import com.sample.android.tmdb.SortType.HIGHEST_RATED
import com.sample.android.tmdb.di.ActivityScoped
import com.sample.android.tmdb.ui.base.BaseFragment
import javax.inject.Inject

@ActivityScoped
class HighRateMoviesFragment @Inject
constructor() : BaseFragment() {

    override fun getSortType(): SortType = HIGHEST_RATED
}