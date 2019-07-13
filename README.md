# CustomToastMasseg [![](https://jitpack.io/v/pouriaHemmati/CustomToastMasseg.svg)](https://jitpack.io/#pouriaHemmati/CustomToastMasseg)



This project provides a view for android apps that implements Toast view.

![Image](http://uupload.ir/files/7b3_toast.jpg)

## Installing
**Quick Setup**

**1.You can import in build.gradle like this**

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
```
dependencies {
	         implementation 'com.github.pouriaHemmati:CustomToastMasseg:1.0.0'
	}
  ```
  If you use maven, add this
  ```
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  ```
 

	<dependency>
	    <groupId>com.github.pouriaHemmati</groupId>
	    <artifactId>CustomToastMasseg</artifactId>
	    <version>1.0.0</version>
	</dependency>


```
**2. Application class**

```
public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	        CustomToastMasseg.showToastMessage(this,"Hello World" , getDrawable(R.drawable.ic_android_black_24dp) );
	}
}
```


## Authors

[pouriaHemmati](https://github.com/pouriaHemmati)

## License

This project is licensed under the MIT License 

