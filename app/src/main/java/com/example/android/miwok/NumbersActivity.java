/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutli"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolooksu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        /**
         * this WordAdapter class is a inferring from ArrayAdapter class.
         * itemsAdapter is a WordAdapter obj.
         */
        WordAdapter itemsAdapter = new WordAdapter(this, words);

/*
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");


        ArrayAdapter itemsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, words);
        Log.v("itemsAdapter","itemsAdapter " + itemsAdapter);
*/


/*
        //GridView display
        GridView gridview = (GridView) findViewById(R.id.list);
        gridview.setAdapter(itemsAdapter);
*/

        //ListView display
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


/*
        //find rootView from the whole layout
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        //using for loop build a view
        for (int index = 0; index < words.size(); index++){
            //create a new TextView
            TextView wordView = new TextView(this);
            //set Text for the new TextView
            wordView.setText(words.get(index));
            //add this TextView as a child to rootView
            rootView.addView(wordView);
            //update counter variable
            index++;
        }
*/

/*
        //using while loop build a view

        //create variables to track index
        int index = 0;

        while(index < words.size()) {

            //create a new TextView
            TextView wordView = new TextView(this);
            //set Text for the new TextView
            wordView.setText(words.get(index));
            //add this TextView as a child to rootView
            rootView.addView(wordView);
            //update counter variable
            index++;
        }
*/


/*
        // allocates memory for 10 integers
        String[] anArray = new String[10];

        // initialize first element
        anArray[0] = "one";
        // initialize second element
        anArray[1] = "one";
        // and so forth
        anArray[2] = "one";
        anArray[3] = "one";
        anArray[4] = "one";
        anArray[5] = "one";
        anArray[6] = "one";
        anArray[7] = "one";
        anArray[8] = "one";
        anArray[9] = "one";
        Log.v("NumberActivity", "Word at index 0: " + anArray[9]);

*/

    }
}
