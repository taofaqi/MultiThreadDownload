package com.aspsine.multithreaddownload.architecture;

import com.aspsine.multithreaddownload.DownloadException;

public interface DownloadResponse {

    void onStarted();

    void onConnecting();

    void onConnected(long time, long length, boolean acceptRanges);

    void onConnectFailed(DownloadException e);

    void onConnectCanceled();

    void onDownloadProgress(long finished, long length, int percent);

    void onDownloadCompleted();

    void onDownloadPaused();

    void onDownloadCanceled();

    void onDownloadFailed(DownloadException e);
}
