package com.dxd.pojo;
/**
 * 上传进度
 * @author lujun created at 2018年10月31日 17点27分14秒
 *
 */
public class UploadStatus {

	private long bytesRead;//已读数据
	private long contentLength;//文件总数据
	private long items;//第几个文件
	private long startTime = System.currentTimeMillis();//开始时间
	private long useTime = System.currentTimeMillis();//已用时间
	private int percent;//完成百分比

	public long getBytesRead() {
		return bytesRead;
	}
	public void setBytesRead(long bytesRead) {
		this.bytesRead = bytesRead;
	}
	public long getContentLength() {
		return contentLength;
	}
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}
	public long getItems() {
		return items;
	}
	public void setItems(long items) {
		this.items = items;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getUseTime() {
		return useTime;
	}
	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}


	@Override
	public String toString() {
		return "UploadStatus [bytesRead=" + bytesRead + ", contentLength=" + contentLength + ", items=" + items
				+ ", startTime=" + startTime + ", useTime=" + useTime + ", percent=" + percent + "]";
	}

}
