package de.dc.javafx.bootstrap.dashboard.controller.index.model;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class NavigationItem {
  private final String name;
  
  private final String icon;
  
  public NavigationItem(final String name, final String icon) {
    super();
    this.name = name;
    this.icon = icon;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    return prime * result + ((this.icon== null) ? 0 : this.icon.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NavigationItem other = (NavigationItem) obj;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.icon == null) {
      if (other.icon != null)
        return false;
    } else if (!this.icon.equals(other.icon))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("icon", this.icon);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public String getIcon() {
    return this.icon;
  }
}
