/***
Global license : 

    CC Attribution
    
    author Manuel Dahmen <ibiiztera.it@gmail.com>

***/


package info.emptycanvas.apps.dmr;

import info.emptycanvas.library.object.POINT3D_RIO;
import info.emptycanvas.library.object.Point3D;
import java.util.HashMap;

/**
 *
 * @author Manuel Dahmen <ibiiztera.it@gmail.com>
 */
public class DistanceMap <R>
{
    protected HashMap<Point3D, Double> distances = new HashMap<Point3D, Double>();
    protected HashMap<Point3D, R> objets = new HashMap<Point3D, R>();

    public HashMap<Point3D, Double> getDistances() {
        return distances;
    }
    public HashMap<Point3D, R> getObjets() {
        return objets;
    }
    
    
    
}
