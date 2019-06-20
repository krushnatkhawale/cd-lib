#!/bin/bash

MERGED_FILE="mergedfile.txt"
INPUT_FILE="file.txt"

header=$(head -n 1 file.txt)

echo "Header extracted: $header"

trailer=$(tail -n 1 file.txt)

echo "Trailer extracted: $trailer"

echo $header >> $MERGED_FILE

count=0
content=""
while read -r line; do

  if [ "$line" = "~~~~~~~" ]
  then
      echo $content >> $MERGED_FILE
      echo $line >> $MERGED_FILE
      content=""
      count=$((count+1))
  else
	 content=$content$line
  fi
done < <(tail -n +2 $INPUT_FILE)

echo $trailer >> $MERGED_FILE

echo "File processed successfully with " $count " records"
