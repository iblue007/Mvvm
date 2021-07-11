package com.example.mvvm.utils;

import android.content.res.AssetManager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.libcommon.utils.global.AppGlobals;
import com.example.mvvm.model.BottomBar;
import com.example.mvvm.model.Destination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AppConfig {

    public static HashMap<String, Destination> sDestConfig;
    private static BottomBar sBottomBar;

    public static HashMap<String, Destination> getDestConfig() {
        if (sDestConfig == null) {
            String content = parseFile("destination.json");
            sDestConfig = JSON.parseObject(content, new TypeReference<HashMap<String, Destination>>() {
            });
        }
        return sDestConfig;
    }

    public static BottomBar getBottomBarConfig() {
        if (sBottomBar == null) {
            String content = parseFile("main_tabs_config.json");
            sBottomBar = JSON.parseObject(content, BottomBar.class);
        }
        return sBottomBar;
    }

    private static String parseFile(String fileName) {
        AssetManager assets = AppGlobals.getApplication().getAssets();
        BufferedReader bufferedReader = null;
        InputStream is = null;
        StringBuilder stringBuilder = new StringBuilder();;
        try {
            is = assets.open(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
