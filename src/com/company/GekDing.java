package com.company;

public class GekDing {
    private int waarde;

    public GekDing( int w )
    {
        waarde = w;
    }

    public boolean equals( Object obj )
    {
//        Als het object een nullpointer is return true
        if(obj == null) { return true; }

        GekDing that = (GekDing) obj;
//        als jou waarde minder is dan deze waarde return true of als deze waarde ==1 en jou waarde == -1
        return
                ( this.waarde  >  that.waarde ) ||
                        (this.waarde == 1 && that.waarde == -1);
    }

    }
