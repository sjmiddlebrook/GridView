package com.jackmiddlebrook.gridviewpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jackmiddlebrook on 1/17/15.
 */
public class Board {
    private List<Integer> mIds;

    public Board() {

        mIds = new ArrayList<Integer>();
        mIds.add(R.drawable.stark_name);
        mIds.add(R.drawable.stark);
        mIds.add(R.drawable.baratheon_name);
        mIds.add(R.drawable.baratheon);

    }

    public List<Integer> getShuffledIds() {
        Collections.shuffle(mIds);
        return mIds;
    }

}
