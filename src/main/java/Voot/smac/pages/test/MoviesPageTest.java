package Voot.smac.pages.test;

import org.testng.annotations.Test;

public class MoviesPageTest extends BaseClass
{
@Test(priority=1,description="Verify list overlay is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void mousehoveronMoviesintheheaderandverify() throws InterruptedException{
	moviepage.mouseHoveronMoviesmenuOnHeader();
	
}
@Test(priority=2,description="Verify list of Hindi movies is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void verifyPopularHindiMoviesValue() throws InterruptedException{
	moviepage.verifyPapularHindiMovie();
	
}
@Test(priority=3,description="Verify list of kannada movies is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void verifyPopularkannadaMoviesValue() throws InterruptedException{
	moviepage.verifyPapularKannadaMovie();

}
@Test(priority=4,description="Verify list of Bangali movies is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void verifyPopularBangaliMoviesValue() throws InterruptedException{
	moviepage.verifyPapularBangaliMovie();
}

@Test(priority=5,description="Verify list Kids of movies is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void verifyPopularKidsMoviesValue() throws InterruptedException{
	moviepage.verifyPapularKidsMovie();
}
}