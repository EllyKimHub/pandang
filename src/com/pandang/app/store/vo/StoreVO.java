package com.pandang.app.store.vo;

public class StoreVO {
	private int storeNumber;
	private String storeTitle;
	private String storeContent;
	private String storeDate;
	private int storePrice;
	private int storeViewCount;
	private int storeLikeCount;
	private int hashtagNumber;
	private int memberNumber;
	private String memberNickname;
	private String storeFileSystemName;
	private String channelFileSystemName;

	public StoreVO() {}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getStoreTitle() {
		return storeTitle;
	}

	public void setStoreTitle(String storeTitle) {
		this.storeTitle = storeTitle;
	}

	public String getStoreContent() {
		return storeContent;
	}

	public void setStoreContent(String storeContent) {
		this.storeContent = storeContent;
	}

	public String getStoreDate() {
		return storeDate;
	}

	public void setStoreDate(String storeDate) {
		this.storeDate = storeDate;
	}

	public int getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(int storePrice) {
		this.storePrice = storePrice;
	}

	public int getStoreViewCount() {
		return storeViewCount;
	}

	public void setStoreViewCount(int storeViewCount) {
		this.storeViewCount = storeViewCount;
	}

	public int getStoreLikeCount() {
		return storeLikeCount;
	}

	public void setStoreLikeCount(int storeLikeCount) {
		this.storeLikeCount = storeLikeCount;
	}

	public int getHashtagNumber() {
		return hashtagNumber;
	}

	public void setHashtagNumber(int hashtagNumber) {
		this.hashtagNumber = hashtagNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getStoreFileSystemName() {
		return storeFileSystemName;
	}

	public void setStoreFileSystemName(String storeFileSystemName) {
		this.storeFileSystemName = storeFileSystemName;
	}

	public String getChannelFileSystemName() {
		return channelFileSystemName;
	}

	public void setChannelFileSystemName(String channelFileSystemName) {
		this.channelFileSystemName = channelFileSystemName;
	}

	@Override
	public String toString() {
		return "StoreVO [storeNumber=" + storeNumber + ", storeTitle=" + storeTitle + ", storeContent=" + storeContent
				+ ", storeDate=" + storeDate + ", storePrice=" + storePrice + ", storeViewCount=" + storeViewCount
				+ ", storeLikeCount=" + storeLikeCount + ", hashtagNumber=" + hashtagNumber + ", memberNumber="
				+ memberNumber + ", memberNickname=" + memberNickname + ", storeFileSystemName=" + storeFileSystemName
				+ ", channelFileSystemName=" + channelFileSystemName + "]";
	}
}

