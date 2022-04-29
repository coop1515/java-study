package com.douzone.paint.point;

import com.douzone.paint.inteface.Drawable;

public class Point implements Drawable{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("점[x= " + x + ", y= " + y + " ]을 그렸습니다.");
	}

	public void disapear() {
		System.out.println("점[x= " + x + ", y= " + y + " ]을 지웠습니다.");
	}
	public void show(boolean visible) {
		if (visible) {
			show();
			// System.out.println("점[x= " + x + ", y= " + y + " ]을 그렸습니다.");
		} else {
			disapear();
			// System.out.println("점[x= " + x + ", y= " + y + " ]을 지웠습니다.");
		} // 이렇게 해야 다음에 변경할때도 코드 수정하기가 쉬움.
	}

	@Override
	public void draw() {
		show();
	}

	
}
