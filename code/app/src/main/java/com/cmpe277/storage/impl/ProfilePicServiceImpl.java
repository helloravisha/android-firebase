package com.cmpe277.storage.impl;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.cmpe277.util.StorageUtil;
import com.cmpe277.storage.api.ProfilePicService;
import com.cmpe277.storage.util.FirebaseImageLoader;

/**
 * Created by ravisha on 12/21/16.
 */
public class ProfilePicServiceImpl implements ProfilePicService {

    @Override
    public void loadProfilePic(Activity activity, ImageView profilePicImageView, String profilePicPath)  {
        Glide.with(activity)
                .using(new FirebaseImageLoader())
                .load(StorageUtil.getStorageReference().child(profilePicPath))
                        .into(profilePicImageView);
    }
}
