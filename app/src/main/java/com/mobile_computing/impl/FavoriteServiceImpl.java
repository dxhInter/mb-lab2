package com.mobile_computing.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.mobile_computing.FavoriteService;
import com.mobile_computing.MobileComputingApplication;

import java.util.List;

/**
 * @author dxh
 * @date 2024/1/31
 */
public class FavoriteServiceImpl implements FavoriteService {
    private static final SharedPreferences preferences;

    static {
        Context context = MobileComputingApplication.getInstance();
        preferences = context.getSharedPreferences(MobileComputingApplication.PREFERENCE_FILE_NAME, Context.MODE_PRIVATE);
    }

    /**
     * Retrieves the list of IDs marked as favorite from Shared Preferences.
     * @return the list of IDs marked as favorite.
     */
    @Override
    public List<String> queryFavoriteList() {
        return null;
    }

    /**
     * Updates the list of IDs marked as favorite in Shared Preferences.
     * @param favoriteList the list of IDs marked as favorite.
     */
    @Override
    public void setFavoriteList(List<String> favoriteList) {

    }

    /**
     * When a user marks an item as favorite, adds the ID to the list of favorites and updates it in Shared Preferences.
     * @param id the ID of the item marked as favorite.
     * @return true means success, false otherwise
     */
    @Override
    public boolean addBook2FavoriteList(int id) {
        return false;
    }

    /**
     * When a user cancel star on the book, removes the ID from the list of favorites and updates it in Shared Preferences.
     * @param id the ID of the item marked as favorite.
     * @return true means success, false otherwise
     */
    @Override
    public boolean removeBookFromFavoriteList(int id) {
        return false;
    }
}
