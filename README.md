Humanizer-for-Android
=====

    ThisIsAnExample => This is an example
    THIS IS AN EXAMPLE => This is an example
    
    
Usage
=====

### First char to uppercase:

Before => this is an Example

After  => This is an example

    String result = Humanizer.FirstChar(stringValue);
    
    
### Names:

Before => this is an example

After  => This Is An Example
  
    String result = Humanizer.Name(stringValue);
    
Gradle
=====

Into your build.gradle:

    repositories {
      maven { url "https://jitpack.io" }
    }

    dependencies {
      compile 'com.github.Pierry:Humanizer-for-Android:v1.0'
    }
