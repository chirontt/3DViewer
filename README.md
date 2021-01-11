# 3D Model Viewer

This 3DViewer project is a sample JavaFX application extracted from [openjdk/jfx/apps/samples/3DViewer](https://github.com/openjdk/jfx/tree/master/apps/samples/3DViewer).

Description for 3DViewer extracted from [openjdk/jfx/apps/samples/samples_readme.txt](https://github.com/openjdk/jfx/blob/master/apps/samples/samples_readme.txt):

<pre>
	3DViewer is a sample application that allows the user to navigate and examine a 
	3D scene with a mouse or a trackpad. 3DViewer has importers for a subset of the 
	features in OBJ and Maya files. The ability to import animation is also 
	provided for Maya files. (Note that in the case of Maya files, construction 
	history should be deleted on all the objects when saving as a Maya file.) 
	3DViewer also has the ability to export the contents of the scene as Java or 
	FXML files.
</pre>

An excellent overview of this 3DViewer application is described on [3DViewer: Better 3D for JavaFX](https://news.kynosarges.org/2018/04/08/3dviewer-better-3d-for-javafx/) by Christoph Nahr.

The 3D model code in this application is used as a library dependency to the beautiful [RubikFX](https://github.com/jperedadnr/RubikFX), a Rubik's Cube 3D simulator by José Pereda.

Gradle build script is updated to build a stand-alone `Viewer3D` application and/or library, for Java/JavaFX 11+. The name is changed from the default `3DViewer` to `Viewer3D`, to avoid the following error at runtime when the jar file happens to be on the module path:

	Error occurred during initialization of boot layer
	java.lang.module.FindException: Unable to derive module descriptor for lib/3DViewer.jar
	Caused by: java.lang.IllegalArgumentException: 3DViewer: Invalid module name: '3DViewer' is not a Java identifier

## Gradle tasks

To build and run the application, execute the Gradle `run` command:

	gradlew run

To create an "exploded" distribution:

	gradlew installDist

and the *platform-specific* distribution should be available in `build/install` directory that can be executed on the command line:

	cd build/install/Viewer3D-linux
	./Viewer3D

(or if building on a Windows machine:

	cd build\install\Viewer3D-win
	Viewer3D.bat

)

To create a zip distribution:

	gradlew distZip

and the *platform-specific* zip distribution, e.g. `Viewer3D-win.zip`, should be available in `build/distributions` directory.

To create an executable fat jar which includes all dependencies for all supported OS'es:

	gradlew fatJar

and the resulting `Viewer3D-no-deps.jar` file should be created in `build/libs` and can be executed directly with the java command:

	java -jar build/libs/Viewer3D-no-deps.jar

(or if building on a Windows machine:

	java -jar build\libs\Viewer3D-no-deps.jar

)

This fat jar should be portable across all three supported OS'es (Windows, Mac and Linux.)

## IDE support

The project can be imported as-is to any IDE such as Eclipse, IntelliJ IDEA, etc, which understands a Gradle project structure.

