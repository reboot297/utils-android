package com.reboot297.utils.android;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by  reboot297
 * on 01.01.2017.
 */

public class DBUtils {

    public static  int getInt(@Nullable Cursor cursor, @NonNull String columnName){
        if(cursor != null) {
            int columnIndex = cursor.getColumnIndex(columnName);
            if(columnIndex != -1) {
                return cursor.getInt(columnIndex);
            }
        }
        return -1;
    }

    public static int getInt(@Nullable Cursor cursor, @NonNull String columnName, int defaultValue){
        if(cursor != null) {
            int columnIndex = cursor.getColumnIndex(columnName);
            if(columnIndex != -1) {
                return cursor.getInt(columnIndex);
            }
        }
        return defaultValue;
    }
}
