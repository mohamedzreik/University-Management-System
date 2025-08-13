package Generics;

import java.util.Objects;

public class pair <k,v>{

private k key;
private v value;

public pair(k key, v value) {
	super();
	this.key = key;
	this.value = value;
}

public k getKey() {
	return key;
}
public v getValue() {
    return value;
    
}
public void setKey(k key) {
    this.key = key;
}
public void setValue(v value) {
    this.value = value;
}
public void swap(){
    v tempValue = value;
    value = (v) key;
    key = (k) tempValue;
}

    @Override
    public String toString() {
        return "pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof pair<?, ?> pair)) return false;
        return Objects.equals(getKey(), pair.getKey()) && Objects.equals(getValue(), pair.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }
}
