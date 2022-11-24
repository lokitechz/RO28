import vn.com.vti.entity.Position;
import vn.com.vti.entity.PositionName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static vn.com.vti.util.Utils.REGEX_EMAIL;

public class RegexSample {

	public static void main(String[] args) {
		Position position = new Position();
		position.setId(1);
		String dbValue = "Dev";
		switch (dbValue){
			case "Dev":
				position.setName(PositionName.DEV);

			case "Test":
				position.setName(PositionName.TEST);
		}
		position.setName(PositionName.PM);
	}

}
