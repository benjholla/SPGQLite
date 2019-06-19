package spgqlite.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class GraphElement {
	
	private static Integer addresses = 0;
	private Integer address;
	
	private Set<String> tags;
	private Map<String,Object> attributes;
	
	protected GraphElement() {
		this.address = addresses++;
		this.tags = new HashSet<String>();
		this.attributes = new HashMap<String,Object>();
	}
	
	public Set<String> tags(){
		return tags;
	}
	
	public Map<String,Object> attributes(){
		return attributes;
	}
	
	public boolean hasAttr(String name) {
		return attributes.containsKey(name);
	}
	
	public Object putAttr(String name, Object value) {
		return attributes.put(name, value);
	}
	
	public Object getAttr(String name) {
		return attributes.get(name);
	}
	
	public Object removeAttr(String name) {
		return attributes.remove(name);
	}
	
	public Integer getAddress() {
		return address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GraphElement))
			return false;
		GraphElement other = (GraphElement) obj;
		return Objects.equals(address, other.address);
	}
	
}
