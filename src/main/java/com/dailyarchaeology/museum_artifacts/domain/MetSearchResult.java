package com.dailyarchaeology.museum_artifacts.domain;

import java.util.ArrayList;
import java.util.Objects;

public class MetSearchResult {
    private int total;
    private ArrayList<Integer> objectIDs;

    public MetSearchResult(int total, ArrayList<Integer> objectIDs) {
        this.total = total;
        this.objectIDs = objectIDs;
    }

	public MetSearchResult() {
	}

	public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Integer> getObjectIDs() {
        return objectIDs;
    }

    public void setObjectIDs(ArrayList<Integer> objectIDs) {
        this.objectIDs = objectIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetSearchResult results = (MetSearchResult) o;
        return getTotal() == results.getTotal() && getObjectIDs().equals(results.getObjectIDs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotal(), getObjectIDs());
    }

    @Override
    public String toString() {
        return "Results{" +
                "total=" + total +
                ", objectIDs=" + objectIDs +
                '}';
    }
}
