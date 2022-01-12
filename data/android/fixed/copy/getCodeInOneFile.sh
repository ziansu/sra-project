while IFS= read -r line; do
	while IFS= read -r lineOne; do
		cat $lineOne >> allFixed$line.java
		echo "\n" >> allFixed$line.java
	done < $line
done < list
