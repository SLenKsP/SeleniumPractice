package testCases;



import basicSelenium.DragDrop;


public class TestCaseDragAndDrop 
{
	
	public void step1_Launch()
	{
		DragDrop launch= new DragDrop();
		launch.launch();
	}
	
	
	public void step2_Setup()
	{
		DragDrop set= new DragDrop();
		set.testSetup();
	}
	
	
	public void step3_DragDrop()
	{
		DragDrop perform= new DragDrop();
		perform.dragDropElement();
	}
	
	
	public void lastStep_Exit()
	{
		DragDrop exit= new DragDrop();
		exit.exit();
	}
}
