#!/bin/bash

for i in {1..100000}
do
  for i in {1..80}
  do
    curl localhost:9090/
    curl localhost:9091/
  done
done
