/*
 * PixLive SDK Sample for Android
 * Copyright (C) 2012-2015 PixLive SDK
 *
 */

package com.mycompany.myarapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.vidinoti.android.vdarsdk.camera.DeviceCameraImageSender;
import com.vidinoti.android.vdarsdk.VDARAnnotationView;
import com.vidinoti.android.vdarsdk.VDARCode;
import com.vidinoti.android.vdarsdk.VDARContext;
import com.vidinoti.android.vdarsdk.VDARPrior;
import com.vidinoti.android.vdarsdk.VDARRemoteController;
import com.vidinoti.android.vdarsdk.VDARRemoteController.ObserverUpdateInfo;
import com.vidinoti.android.vdarsdk.VDARRemoteControllerListener;
import com.vidinoti.android.vdarsdk.VDARSDKController;
import com.vidinoti.android.vdarsdk.VDARSDKControllerEventReceiver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class introAct extends Activity {

    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        videov = (VideoView) findViewById(R.id.videoView);
        String videopath = "android.resource://com.mycompany.myarapplication.mansl/"+R.raw.intromono;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.start();

    }



    public void startAR(View v) {
        Intent intent = new Intent(introAct.this, ARActivity.class);

        startActivity(intent);
    }


}
