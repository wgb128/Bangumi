package com.fanchen.imovie.entity.k8dy;

import com.fanchen.imovie.entity.face.IPlayUrls;
import com.fanchen.imovie.entity.face.IVideoEpisode;

import java.util.Map;

/**
 * Created by fanchen on 2017/10/16.
 */
public class K8dyPlayUrl implements IPlayUrls {
    private boolean success;
    private String message;
    private int urlType = URL_M3U8;
    private int playType = IVideoEpisode.PLAY_TYPE_VIDEO;
    private Map<String, String> urls;

    @Override
    public Map<String, String> getUrls() {
        return urls;
    }

    @Override
    public int getPlayType() {
        return playType;
    }

    @Override
    public int getUrlType() {
        return urlType;
    }

    @Override
    public String getReferer() {
        return "http://m.k8yy.com/";
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUrls(Map<String, String> urls) {
        this.urls = urls;
    }

    public void setPlayType(int playType) {
        this.playType = playType;
    }

    public void setUrlType(int urlType) {
        this.urlType = urlType;
    }
}
