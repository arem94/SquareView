# SquareView
a View for create square and rectangle 
--------------------------
# Version
[![](https://jitpack.io/v/arem94/SquareView.svg)](https://jitpack.io/#arem94/SquareView)


#Download
----------------------------
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.arem94:SquareView:1.0.0'
	}


#Usage
-----------------------------
add in xml file

	<ir.steponit.squareview.SquareView
        	android:layout_width="match_parent"
        	android:layout_height="match_parent"
       	 	app:ratio="0.5"
        	app:according="Width">
    	</ir.steponit.squareview.SquareView>
	



