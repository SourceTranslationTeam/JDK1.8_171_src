package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerNotRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-amd64/jdk8u291/1294/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, April 7, 2021 7:14:18 PM GMT
*/

public final class ServerNotRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerNotRegistered value = null;

  public ServerNotRegisteredHolder ()
  {
  }

  public ServerNotRegisteredHolder (com.sun.corba.se.spi.activation.ServerNotRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.type ();
  }

}
