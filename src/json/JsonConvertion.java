package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvertion {

	private Gson gson = new GsonBuilder().create();

	public void jsonCon() {

	}

	public String getObject(Object obj) {
		return gson.toJson(obj);

	}
}
