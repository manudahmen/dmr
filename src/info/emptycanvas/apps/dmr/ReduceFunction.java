/***
Global license : 

    CC Attribution
    
    author Manuel Dahmen <ibiiztera.it@gmail.com>

***/


package info.emptycanvas.apps.dmr;

/**
 *
 * @author Manuel Dahmen <ibiiztera.it@gmail.com>
 * @param <R>
 * @param <O>
 */
public interface ReduceFunction<R, O> {
    public O compute(DistanceMap<R> dm);
}
