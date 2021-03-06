package android.swapanpal.com.flashchatappwithfirebase;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class ChatListAdapter extends BaseAdapter {

    private Activity mActivity;
    private DatabaseReference mDatabaseReference;
    private String mDisplayName;
    private ArrayList<DataSnapshot> mSnapShortList;

    /**
     * Constructor for the Adapter clas
     * @param activity
     * @param ref
     * @param name
     */
    public ChatListAdapter(Activity activity, DatabaseReference ref, String name){
        mActivity = activity;
        mDisplayName = name;
        mDatabaseReference = ref.child("messages");
        mSnapShortList = new ArrayList<>();
    }

    /**
     * Inner class
     */
    static class ViewHolder{
        TextView authorName;
        TextView body;
        LinearLayout.LayoutParams params;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
