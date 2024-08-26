package com.mindgate.main.factory;

import com.mindgate.main.domain.Circle;
import com.mindgate.main.domain.Line;
import com.mindgate.main.domain.Shape;
import com.mindgate.main.domain.Triangle;

public class ShapeFactory {
	public Shape getShape(int choice) {
		switch (choice) {
		case 1:
			return new Circle();
		case 2:
			return new Triangle();
		case 3:
			return new Line();
		default:
			return new Shape();
		}
	}
}
