package com.example.mihaela.smarthouse.command_center;

<<<<<<< HEAD
import com.example.mihaela.smarthouse.smart_unit.ASmartUnit;
=======
import android.content.Intent;
import android.util.Log;
import android.view.View;

import static android.support.v4.app.ActivityCompat.startActivity;
>>>>>>> origin/master

/**
 * Created by Mihaela on 24.04.2016.
 */
public class CmdButtonListItem implements CmdListItem{
    private String title;
    private String status;
<<<<<<< HEAD
    private String id;
    private ASmartUnit unit;
=======
    private int index;
>>>>>>> origin/master

    public String getTitle() {
        return title == null? " " : title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getStatus() {
        return status == null ? "" : status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

<<<<<<< HEAD
    public String getId() {
        return id;
    }

    @Override
    public ASmartUnit getSmartUnit() {
        return unit;
    }

    @Override
    public void setSmartUnit(ASmartUnit unit) {
            this.unit=unit;
    }

    public void setId(String id) {
        this.id = id;
    }
=======
    public void setIndex(int index){
        this.index=index;
    }

>>>>>>> origin/master
}