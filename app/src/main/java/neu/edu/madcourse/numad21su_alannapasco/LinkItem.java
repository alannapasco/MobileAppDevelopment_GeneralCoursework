package neu.edu.madcourse.numad21su_alannapasco;

import android.util.Log;

/*
    Represents one single item in the LinkCollector feature
    Components needed:
        -This LinkCollector     activity
        -LinkClickListener      interface
        -LinkItem               class
        -RecViewAdapter         bridges the backend LinkItems to frontend RecViewHolder
        -RecViewHolder          manages what's in item_card.xml
 */
public class LinkItem {

    private final String linkName;
    public final String linkURL;

    public LinkItem(String linkName, String linkURL){
        this.linkName = linkName;
        this.linkURL = linkURL;
    }

    public String getLinkName(){
        return this.linkName;
    }

    public String getLinkURL(){
        return this.linkURL;
    }

    public void onItemClick(int index){
        //TODO
        //Launch new Intent with the browser open to the URL
        Log.v("LinkItemClicked", "Link: " + getLinkName());
    }

}