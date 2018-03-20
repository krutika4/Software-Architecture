package Toll_verify;

import org.osate.aadl2.instance.ComponentInstance;

@SuppressWarnings("all")
public class tollTestComp {
  public boolean comp(final ComponentInstance ci, final double a, final double b) {
    return (a > b);
  }
}