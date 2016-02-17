package com.ar9013.hello_jme3;
import com.jme3.app.SimpleApplication;
import com.jme3.bounding.BoundingBox;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;

public class HelloJME3 extends SimpleApplication {

	public static void main(String[] args) {
		HelloJME3 app = new HelloJME3();
        app.start();
	}

	@Override
	public void simpleInitApp() {
		  Box b = new Box(1, 1, 1);
		Geometry geom = new Geometry("Box", b);
		Material mat = new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md");
		
		  mat.setColor("Color", ColorRGBA.Blue);   
		geom.setMaterial(mat);
		rootNode.attachChild(geom);
	}

}
