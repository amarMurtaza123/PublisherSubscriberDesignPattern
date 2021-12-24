/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author fa18-bse-105
 */
public class JSONExporter implements Visitor {
    
    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("JSON" + "\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot d) {
        return "{\nDot{" + "\n" +
                "    \"id\": " + d.getId() + "," + "\n" +
                "    \"x\": " + d.getX() + "," + "\n" +
                "    \"x\": " + d.getY() + "," + "\n" +
                "},";
    }

    @Override
    public String visitCircle(Circle circle) {
                return "{\nCircle{" + "\n" +
                "    \"id\": " + circle.getId() + "," + "\n" +
                "    \"x\": " + circle.getX() + "," + "\n" +
                "    \"x\": " + circle.getY() + "," + "\n" +
                "    \"Radius\": " + circle.getRadius()+ "," + "\n" +
                "},";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
                return "{\nRectangle{" + "\n" +
                "    \"id\": " + rectangle.getId() + "," + "\n" +
                "    \"x\": " + rectangle.getX() + "," + "\n" +
                "    \"x\": " + rectangle.getY() + "," + "\n" +
                "    \"Width\": " + rectangle.getWidth()+ "," + "\n" +
                "    \"Height\": " + rectangle.getHeight()+ "," + "\n" +
                "},";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
                return "{\ncompound_graphic{" + "\n" +
                "   \"id\":" + cg.getId() + "," + "\n" +
                _visitCompoundGraphic(cg) +
                "},";
    }
    
    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.children) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
    
}
