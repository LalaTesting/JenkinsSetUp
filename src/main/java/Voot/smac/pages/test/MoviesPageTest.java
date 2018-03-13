package Voot.smac.pages.test;

import org.testng.annotations.Test;

public class MoviesPageTest extends BaseClass
{
@Test(priority=1,description="Verify list overlay is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void mousehoveronMoviesintheheaderandverify() throws InterruptedException{
	moviepage.mouseHoveronMoviesmenuOnHeader();
	
}
@Test(priority=2,description="Verify list of movies is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.")
public void verifyPopularMoviesValue() throws InterruptedException{
	moviepage.verifyPapularHindiMovie();
	
}


}
