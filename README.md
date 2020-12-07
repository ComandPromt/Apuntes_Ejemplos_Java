# Java

## Instalar Java en Linux
```
apt install default-jre default-jdk
```

## Truncar numero con x decimales

```java
	double truncateDouble(double number, int numDigits) {
		double result = number;
		String arg = "" + number;
		int idx = arg.indexOf('.');
		if (idx != -1) {
			if (arg.length() > idx + numDigits) {
				arg = arg.substring(0, idx + numDigits + 1);
				result = Double.parseDouble(arg);
			}
		}
		return result;
	}
```
