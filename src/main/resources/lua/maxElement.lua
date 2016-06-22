s =  box.space.test
tmp = 0
for k, v in s:pairs{} do
    if v[1] > tmp then
        tmp = v[1]
    end
end
return tmp