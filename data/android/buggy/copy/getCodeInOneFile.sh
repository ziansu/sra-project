while IFS= read -r line; do
	while IFS= read -r lineOne; do
		cat $lineOne >> allBuggy$line.java
		echo "\n" >> allBuggy$line.java
	done < $line
done < list
