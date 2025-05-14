#!/bin/bash

repo_dir="$1"

find "$repo_dir" -type f -name "metainfo.yaml" | while read -r file; do
  if grep -q 'ObjectId: PT' "$file"; then 
    echo "Deleting folder: $(dirname "$file")"
    rm -rf "$(dirname "$file")"
  fi
done
