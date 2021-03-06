/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/**
 * Data Helper to build Line Charts.
 * 
 * @param <T>
 *            Type of number. Ex.: Double, Integer, Float, etc.
 * @author inaiat
 */
public class LinedData<T extends Number> extends AbstractCollectionData<T> {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -550315213084815871L;

    /** The data. */
    private List<T> data = new ArrayList<T>();

    /**
     * Instantiates a new lined data.
     */
    public LinedData() {
    }

    /**
     * Instantiates a new lined data.
     * 
     * @param values
     *            the values
     */
    public LinedData(T... values) {
	addValues(values);
    }

    /*
     * (non-Javadoc)
     * 
     * @see br.com.digilabs.jqplot.data.ChartData#getData()
     */
    public Collection<T> getData() {
	return data;
    }

    /**
     * Gets the size of the data.
     *
     * @return the data
     */
    public int size()
    {
        return data.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see br.com.digilabs.jqplot.data.ChartData#toJsonString()
     */
    public String toJsonString() {
	JSONArray jsonArray = new JSONArray();
	jsonArray.put(data);
	return jsonArray.toString();
    }

}
