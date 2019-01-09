package com.dxd.utils.fileupload;

import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.ProgressListener;

import com.dxd.pojo.UploadStatus;

public class UploadListener implements ProgressListener{

	private HttpSession session;

	public UploadListener(HttpSession session) {
		super();
		this.session = session;
		UploadStatus uploadStatus = new UploadStatus();
		session.setAttribute("upload_status", uploadStatus);
	}

	@Override
	public void update(long bytesRead, long contentLength, int items) {
		UploadStatus uploadStatus = (UploadStatus) session.getAttribute("upload_status");
		uploadStatus.setBytesRead(bytesRead);
		uploadStatus.setContentLength(contentLength);
		uploadStatus.setItems(items);
		uploadStatus.setUseTime(System.currentTimeMillis()-uploadStatus.getStartTime());
		uploadStatus.setPercent((int)(100*bytesRead/contentLength));
		session.setAttribute("upload_status", uploadStatus);
	}

}
