package org.sonatype.flexmojos.common;

import org.sonatype.flexmojos.compiler.IFrame;

public class MavenFrame
    implements IFrame
{
    private String label;

    private String[] classNames;

    public String[] classname()
    {
        return classNames;
    }

    public String label()
    {
        return label;
    }
}
