/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {

	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("../assets/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** Method to test zeroRed */
	public static void testZeroRed() {
		Picture beach = new Picture("../assets/beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("../assets/caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("../assets/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("../assets/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("../assets/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/** Converts to black and white */
	public static void convertToBlackAndWhite() {
		Picture pic = new Picture("../assets/femaleLionAndHall.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] pixelsRow : picPixels) {
			for (Pixel pixel : pixelsRow) {
				int averageColor = (int)pixel.getAverage();
				pixel.setRed(averageColor);
				pixel.setGreen(averageColor);
				pixel.setBlue(averageColor);
			}
		}
		pic.explore();
	}

	/** Adjusts the brightness of the picture */
	public static void adjustBrightness(double brightnessPercentage) {
		Picture pic = new Picture("../assets/koala.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] pixelsRow : picPixels) {
			for (Pixel pixel : pixelsRow) {
				if ((pixel.getRed() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setRed((int)(pixel.getRed() * brightnessPercentage));
				if ((pixel.getGreen() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setGreen((int)(pixel.getGreen() * brightnessPercentage));
				if ((pixel.getBlue() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setBlue((int)(pixel.getBlue() * brightnessPercentage));
			}
		}
		pic.explore();
	}

	/**
	 * Main method for testing. Every class can have a main
	 * method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test and comment out the ones you don't want to run
		// testZeroBlue();
		// testZeroRed();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
		// convertToBlackAndWhite();
		// adjustBrightness(.8);
	}
}