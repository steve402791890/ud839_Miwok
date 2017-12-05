package com.example.android.miwok;

/**
 * Created by ningyang on 11/30/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * get default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * get miwok translation of the word
     */

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
