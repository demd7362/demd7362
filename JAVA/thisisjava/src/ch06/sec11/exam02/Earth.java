package ch06.sec11.exam02;

public class Earth {
	final static double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	// 순서 상관x
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI *EARTH_RADIUS * EARTH_RADIUS;
	}
}
