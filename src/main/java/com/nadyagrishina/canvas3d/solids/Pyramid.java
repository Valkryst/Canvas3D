package com.nadyagrishina.canvas3d.solids;

import com.nadyagrishina.canvas3d.transforms.Point3D;

public class Pyramid extends Solid{
    public Pyramid(){
        //vertex buffers
        vb.add(new Point3D(-1,-1,-1)); //p0
        vb.add(new Point3D(1,-1,-1)); //p1
        vb.add(new Point3D(1,1,-1)); //p2
        vb.add(new Point3D(-1,1,-1)); //p3

        vb.add(new Point3D(0, 0, 1));

        // Index buffer
        addIndices(
                0, 1,
                1, 2,
                2, 3,
                3, 0,
                0, 4,
                1, 4,
                2, 4,
                3, 4
        );
    }
}
